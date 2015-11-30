<?php
namespace Aspose\Diagram\WorkingwithPages;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\Page as Page;
class GetPageInfo{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        #page = diagram.getPages().getPage(page_id)
        $page = $diagram->getPages()->getPage(0);

        print "Page ID : ".$page->getName().PHP_EOL;
    }
}