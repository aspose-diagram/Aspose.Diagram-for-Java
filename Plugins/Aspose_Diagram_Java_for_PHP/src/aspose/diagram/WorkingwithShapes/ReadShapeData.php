<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ReadShapeData{

    public static function run($dataDir=null){

        # Read All Shape Properties
        ReadShapeData::read_all_shape_properties($dataDir);

        # Read a Shape Property by Name
        ReadShapeData::read_shape_property_by_name($dataDir);
    }

    public static function read_all_shape_properties($dataDir=null)
    {

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "Drawing.vsd");

        $shapes = $diagram->getPages()->getPage(0)->getShapes();

        $i = 0;
        while ($i <(int)(string)$shapes->getCount()){
        $shape = $shapes->get($i);
        if ($shape->getName() == "Process") {
        $j = 0;
        while ($j<(int)(string)$shape->getProps()->getCount()) {
            $property = $shape->getProps()->get($j);
            print $property->getLabel()->getValue() . ": " . $property->getValue()->getVal();
            $j += 1;
        }
        break;
        }
        $i += 1;
        }
    }

    public static function read_shape_property_by_name($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."Drawing.vsd");

        $shapes=$diagram->getPages()->getPage(0)->getShapes();

        $i = 0;
        while($i<(int)(string)$shapes->getCount()) {
            $shape = $shapes->get($i);
            if ($shape->getName() == "Process") {
                $property=$shape->getProps()->getProp("Cost");
                print $property->getLabel()->getValue().": ".$property->getValue()->getVal().PHP_EOL;
            }
        $i+= 1;
        }
    }
}