<?php
namespace Aspose\Diagram\WorkingwithUserdefinedCells;

use com\aspose\diagram\Diagram as Diagram;
class ReadUserDefinedCells{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "drawing.vdx");

        $shapes = $diagram->getPages()->getPage("Flow 1")->getShapes();

        $i = 0;
        while($i<(int)(string)$shapes->getCount()) {
        $shape=$shapes->get($i);
        if($shape->getNameU()=="Process") {
        $users = $shape->getUsers();
        $j = 0;
        while ($j<(int)(string)$users->getCount()) {
            $user = $users->get($j);
            print $user->getName() . ": " . $user->getValue()->getVal();
            $j += 1;
        }
        break;
        }
        $i+=1;
        }
    }
}