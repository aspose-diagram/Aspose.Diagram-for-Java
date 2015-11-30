<?php
namespace Aspose\Diagram\WorkingwithDiagrams;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class CreateDiagram{

    public static function run($dataDir=null){
        # Create instance of Diagram
        $diagram = new Diagram();

        # Save as VDX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."CreateDiagram.vdx", $saveFileFormat->VDX);
        print "Created visio diagram successfully!".PHP_EOL;
    }
}