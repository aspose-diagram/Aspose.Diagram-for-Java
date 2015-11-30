<?php
namespace Aspose\Diagram\WorkingwithWindowElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class GetWindowElements{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $windows=$diagram->getWindows();

        $i = 0;
        while ($i<(int)(string)$windows->getCount()) {
            $window=$windows->get($i);
            print "ID: ".(string)$window->getID();
            print "Type: ".(string)$window->getWindowType();
            print "Window height: ".(string)$window->getWindowHeight();
            print "Window width: ".(string)$window->getWindowWidth();
            print"Window state: ".(string)$window->getWindowState();
            $i+= 1;
        }
    }
}