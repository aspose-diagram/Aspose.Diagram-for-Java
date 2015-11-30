<?php
namespace Aspose\Diagram\WorkingwithWindowElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Window as Window;
use com\aspose\diagram\WindowStateValue as WindowStateValue;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\WindowTypeValue as WindowTypeValue;

class AddWindowElement{
    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # initialize window object
        $window = new Window();

        # set window state
        $windowStateValue=new WindowStateValue();
        $window->setWindowState($windowStateValue->MAXIMIZED);

        # set window height
        $window->setWindowHeight(500);

        # set window width
        $window->setWindowWidth(500);

        # set window type
        $windowTypeValue=new WindowTypeValue();
        $window->setWindowType($windowTypeValue->STENCIL);

        # add window object
        $diagram->getWindows()->add($window);

        # save in any supported format
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."AddWindowElement.vdx", $saveFileFormat->VDX);

        print "Added window element to the visio instance.".PHP_EOL;
    }
}