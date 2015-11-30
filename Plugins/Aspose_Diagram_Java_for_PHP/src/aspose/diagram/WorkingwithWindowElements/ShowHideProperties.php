<?php
namespace Aspose\Diagram\WorkingwithWindowElements;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ShowHideProperties{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram =new Diagram($dataDir."Drawing.vsd");

        # get window object by index
        $window=$diagram->getWindows()->get(0);

        # set visibility of grid
        $window->setShowGrid(1);

        # set visibility of guides
        $window->setShowGuides(1);

        # set visibility of rulers
        $window->setShowRulers(1);

        # set visibility of page breaks
        $window->setShowPageBreaks(1);

        # save in any supported format
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."ShowHideProperties.vdx", $saveFileFormat->VDX);
        print "Show and Hide Grids, Rulers, Guides and Page Breaks of the Visio Diagram.".PHP_EOL;
    }
}