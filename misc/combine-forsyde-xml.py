#!/usr/bin/python

import sys, shutil, argparse, os.path
from xml.etree.ElementTree import ElementTree, Element

def append_xml(arg, dirname, filenames):
    output_root = arg[0];
    input_top_xml = arg[1];
    for filenameext in filenames:
        filename, fileext = os.path.splitext(filenameext);
        subname = os.path.join(dirname, filenameext);
        if fileext=='.xml' and subname!=input_top_xml:
            input_xml = ElementTree();
            input_xml.parse(subname);
            output_root.append(input_xml.getroot());

#######################
# The executed script #
#######################

# arguments to be passed
arg_parser = argparse.ArgumentParser(
    description='Combine the ForSyDe-XML files representing ForSyDe-IR model of a system to a single XML.'
)
arg_parser.add_argument('input_top_xml',
    help='The XML file representing the top-level process network',
    metavar='input_top_xml'
)
arg_parser.add_argument(
    '-o', '--output',
    metavar='output_xml_file',
    help='The combined XML model',
    dest='output_xml_file'
);
args = arg_parser.parse_args();

# construct the output XML
output_root= Element('system');

## read the top-level input XML file
input_xml = ElementTree();
input_xml.parse(args.input_top_xml);

# append the top-level input XML to the output
output_root.append(input_xml.getroot());

# iteratively read other XML files and append them
input_dir = os.path.dirname(args.input_top_xml);
os.path.walk( input_dir, append_xml, (output_root,os.path.abspath(args.input_top_xml)) );

# write the output XML
output_xml=ElementTree(output_root);
output_xml.write(args.output_xml_file);

