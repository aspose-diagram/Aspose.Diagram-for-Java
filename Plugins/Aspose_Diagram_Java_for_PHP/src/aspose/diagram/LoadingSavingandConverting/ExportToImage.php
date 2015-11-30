<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToImage{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as PNG
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.png", $saveFileFormat->PNG);

        print "Exported visio diagram to PNG.".PHP_EOL;
    }

}