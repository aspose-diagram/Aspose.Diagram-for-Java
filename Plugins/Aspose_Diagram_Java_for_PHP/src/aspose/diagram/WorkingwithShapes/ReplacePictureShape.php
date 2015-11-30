<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\TypeValue as TypeValue;

use java\io\File as File;
use java\nio\file\Files as Files;
class ReplacePictureShape{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # convert image into bytes array
        $fi = new File($dataDir."star.png");

        $files=new Files();
        $file_content = $files->readAllBytes($fi->toPath());

        $shapes = $diagram->getPages()->getPage("Flow 1")->getShapes();

        $i = 0;
        $typeValue=new TypeValue();
        while ($i<(int)(string)$shapes->getCount()) {
        $shape = $shapes->get($i);
        # Filter shapes by type Foreign
        if ($shape->getType() == $typeValue->FOREIGN){
        # replace picture shape
        $shape->getForeignData()->setValue($file_content);
        }
        $i+=1;
        }

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."ReplacePictureShape.vdx", $saveFileFormat->VDX);
        print "Replaced picture shape successfully!".PHP_EOL;
    }
}