<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToPdf{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as PDF file format
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.pdf", $saveFileFormat->PDF);
        print "Exported visio diagram to pdf.".PHP_EOL;
    }
}