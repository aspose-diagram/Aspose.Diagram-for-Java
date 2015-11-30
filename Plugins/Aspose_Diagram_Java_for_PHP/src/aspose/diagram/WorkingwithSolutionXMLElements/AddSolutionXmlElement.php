<?php
namespace Aspose\Diagram\WorkingwithSolutionXMLElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SolutionXML as SolutionXML;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class AddSolutionXmlElement{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."drawing.vsd");

        # initialize SolutionXML object
        $solution_xml=new SolutionXML();

        # set name
        $solution_xml->setName("Solution XML");

        # set xml value
        $solution_xml->setXmlValue("XML Value");

        # add SolutionXML element
        $diagram->getSolutionXMLs()->add($solution_xml);

        # save Visio diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SolutionXmlElement.vdx", $saveFileFormat->VDX);
        print "Added SolutionXML Element to the Visio Drawing.".PHP_EOL;
    }
}