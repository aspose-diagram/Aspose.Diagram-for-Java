<?php
namespace Aspose\Diagram\WorkingwithWindowElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class AddDynamicGridsAndConnectionPoints{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # get window object by index
        $window=$diagram->getWindows()->get(0);

        # check dynamic grid option
        $window->setDynamicGridEnabled(1);

        # check connection points option
        $window->setShowConnectionPoints(1);

        # Save as VDX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."AddDynamicGridsAndConnectionPoints.vsx", $saveFileFormat->VSX);

        print "Added Support of Dynamic Grids and Connection Points in the Visio Drawings.".PHP_EOL;
    }
}
