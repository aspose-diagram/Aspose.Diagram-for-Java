<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToXps{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as XPS
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.xps", $saveFileFormat->XPS);

        print "Exported visio diagram to XPS.".PHP_EOL;
    }
}