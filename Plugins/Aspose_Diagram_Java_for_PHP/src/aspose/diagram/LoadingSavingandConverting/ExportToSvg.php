<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToSvg{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as SVG
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.svg", $saveFileFormat->SVG);

        print "Exported visio diagram to SVG.".PHP_EOL;
    }
}