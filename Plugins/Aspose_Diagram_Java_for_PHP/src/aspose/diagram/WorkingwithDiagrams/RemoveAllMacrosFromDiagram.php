<?php
namespace Aspose\Diagram\WorkingwithDiagrams;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class RemoveAllMacrosFromDiagram{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."drawing.vsd");

        # remove all macros
        $diagram->setVbProjectData(null);

        # Save as VDX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."RemoveAllMacros.vdx", $saveFileFormat->VDX);
        print "Removed all macros from diagram successfully!".PHP_EOL;
    }
}