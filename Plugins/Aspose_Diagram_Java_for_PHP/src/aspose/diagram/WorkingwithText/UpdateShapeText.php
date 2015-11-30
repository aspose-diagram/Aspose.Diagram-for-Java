<?php
namespace Aspose\Diagram\WorkingwithText;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Txt as Txt;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class UpdateShapeText{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."Drawing.vsd");

        $shapes=$diagram->getPages()->getPage(0)->getShapes();
        $i=0;
        while($i<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($i);
        if ($shape->getNameU() == "Process" && (int)(string)$shape->getID() == 1) {
        $shape->getText()->getValue()->clear();
        $shape->getText()->getValue()->add(new Txt("New Text"));
        }
        $i += 1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."UpdateShapeText.vdx",$saveFileFormat->VDX);
        print "Updated shape text.".PHP_EOL;
    }
}