<?php
namespace Aspose\Diagram\WorkingwithUserdefinedCells;

use com\aspose\diagram\Diagram as Diagram;
class GetUserDefinedCells{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir . "drawing.vdx");

        $pages=$diagram->getPages();

        $count=0;
        while($count<(int)(string)$pages->getCount()) {
        $page = $pages->get($count);
        $shapes = $page->getShapes();
        $i = 0;
        while ($i<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($i);
        if ($shape->getNameU() == "Process") {
        $users = $shape->getUsers();
        $j = 0;
        while ($j<(int)(string)$users->getCount()) {
            $user = $users->get($j);
            print "Name: " . $user->getNameU() . " Value: " . $user->getValue()->getVal() . " Prompt: " . $user->getPrompt()->getValue();
            $j += 1;
        }
        break;
        }
        $i += 1;
        }
        $count += 1;
        }
    }
}