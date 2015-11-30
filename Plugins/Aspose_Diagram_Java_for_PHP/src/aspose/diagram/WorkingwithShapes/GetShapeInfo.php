<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
class GetShapeInfo{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing1.vsd");

        $shapes = $diagram->getPages()->getPage(0)->getShapes();

        $i = 0;
        while ($i<(int)(string)$shapes->getCount()) {
            $shape = $shapes->get($i);
            # Display information about the shapes
            print "Shape ID : " . (string)$shape->getID().PHP_EOL;
            print "Name : " . (string)$shape->getName().PHP_EOL;
            print "Master Shape : ".(string)$shape->getMaster()->getName().PHP_EOL;
            $i += 1;
        }
    }
}