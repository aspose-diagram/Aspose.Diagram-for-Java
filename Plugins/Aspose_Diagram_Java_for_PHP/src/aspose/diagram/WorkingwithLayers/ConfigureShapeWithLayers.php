<?php
namespace Aspose\Diagram\WorkingwithLayers;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ConfigureShapeWithLayers{

    public static function run($dataDir=null)
    {

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "Drawing.vsd");

        $shapes = $diagram->getPages()->getPage("Flow 1")->getShapes();

        $i = 0;
        while ($i<(int)(string)$shapes->getCount()) {
            $shape=$shapes->get($i);
            #puts shape.getName().to_s
            if ($shape->getName() == "Process") {
                # Add shape1 in first two layers. Here "0;1" are indexes of the layers
                $layer = $shape->getLayerMem();
                $layer->getLayerMember()->setValue("0;1");
            }
            elseif ($shape->getName()=="Preparation"){
                # Remove shape2 from all the layers
                $layer = $shape->getLayerMem();
                $layer->getLayerMember()->setValue("");
            }
        $i+=1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir . "Layers.vdx", $saveFileFormat->VDX);
        print "Configured Shape Objects with Layers in Visio.".PHP_EOL;
    }
}