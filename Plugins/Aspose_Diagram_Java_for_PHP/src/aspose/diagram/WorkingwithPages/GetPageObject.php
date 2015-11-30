<?php
namespace Aspose\Diagram\WorkingwithPages;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class GetPageObject{

    public static function run($dataDir=null){

        # Getting a Page Object by ID
        GetPageObject::get_page_object_by_id($dataDir);

        # Getting a Page Object by Name
        GetPageObject::get_page_object_by_name($dataDir);
    }

    public static function get_page_object_by_id($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        $page_id = 0;
        # Get page object by id
        $page = $diagram->getPages()->getPage($page_id);
        print "Page : ".(string)$page.PHP_EOL;
    }

    public static function get_page_object_by_name($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Set page name
        $page_name = "Flow 1";
        # Get page object by name
        $page = $diagram->getPages()->getPage($page_name);
        print "Page : ".(string)$page.PHP_EOL;
    }
}