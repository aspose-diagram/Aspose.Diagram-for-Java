<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToXaml{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # Save as XAML
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.xaml", $saveFileFormat->XAML);

        print "Exported visio diagram to XAML.".PHP_EOL;
    }

}