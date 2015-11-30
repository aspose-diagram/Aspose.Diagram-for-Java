<?php
namespace Aspose\Diagram\WorkingwithSolutionXMLElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SolutionXML as SolutionXML;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ReadXmlValues{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vdx");

        $solution_xmls=$diagram->getSolutionXMLs();

        $i= 0;
        while ($i<(int)(string)$solution_xmls->getCount()) {
        $solution_xml =$solution_xmls->get($i);
        # get name property
        print "Name: ".(string)$solution_xml->getName();
        # get xml value
        print "Value:".(string)$solution_xml->getXmlValue();
        $i += 1;
        }
    }
}