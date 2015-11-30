<?php
namespace Aspose\Diagram\WorkingwithPages;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\Page as Page;
class AddPage{

    public static function run($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Get max page ID
        //        $max_page_id = get_max_page_id($diagram);

        $max_page_id = $diagram->getPages()->getPage(0)->getID();
        $i = 1;
        while ($i<(int)(string)$diagram->getPages()->getCount()) {
        if ($max_page_id<$diagram->getPages()->getPage($i)->getID()){
        $max_page_id=$diagram->getPages()->getPage($i)->getID();
        }
        $i+=1;
        }

        # Initialize a new page object
        $new_page = new Page();

        # Set name
        $new_page->setName("new page");

        # Set page ID
        $new_page->setID((int)(string)$max_page_id+1);

        # Or try the Page constructor
        # Page newPage = new Page(MaxPageId + 1);

        # Add a new blank page
        $diagram->getPages()->add($new_page);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."NewPage_Output.vdx", $saveFileFormat->VDX);
        print "Added new page.".PHP_EOL;
    }

    public function get_max_page_id($diagram){

        $max = $diagram->getPages()->getPage(0)->getID();
        $i = 1;
        while ($i<$diagram->getPages()->getCount()) {
            if ($max<$diagram->getPages()->getPage($i)->getID()){
                $max=$diagram->getPages()->getPage($i)->getID();
            }
            $i+=1;
        }
        return $max;
    }
}