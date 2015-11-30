<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToHtml{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as Html
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.html", $saveFileFormat->HTML);

        print "Exported visio diagram to HTML.".PHP_EOL;
    }
}