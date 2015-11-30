<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\TypeValue as TypeValue;

use java\io\FileOutputStream as FileOutputStream;
class ExtractImages{

    public static function run($dataDir=null)
    {

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."drawing.vsd");

        $shapes = $diagram->getPages()->getPage("Flow 1")->getShapes();
        $i = 0;
        $typeValue=new TypeValue();
        while ($i <(int)(string)$shapes->getCount()){
        $shape = $shapes->get($i);
        # Filter shapes by type Foreign
        if ($shape->getType()== $typeValue->FOREIGN){
        # create an image file
        $fos = new FileOutputStream($dataDir."Image#{i}.bmp");
        $fos->write($shape->getForeignData()->getValue());
        $fos->close();
        }
        $i += 1;
        }
        print "Extracted images successfully!".PHP_EOL;
    }
}