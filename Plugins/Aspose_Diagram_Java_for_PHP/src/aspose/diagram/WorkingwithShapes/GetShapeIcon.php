<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;

use java\io\FileOutputStream as FileOutputStream;
class GetShapeIcon{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing1.vsd");

        # get master
        $master = $diagram->getMasters()->getMasterByName("Circle");

        # get byte array
        $bytes = $master->getIcon();

        # create an image file
        $fos = new FileOutputStream($dataDir."star.png");

        # write byte array of the image
        $fos->write($bytes);

        # close array
        $fos->close();
        print "Get shape icon, please check the output file.".PHP_EOL;
    }
}