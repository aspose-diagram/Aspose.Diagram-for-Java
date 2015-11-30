<?php
namespace Aspose\Diagram\WorkingwithLayers;

use com\aspose\diagram\Diagram as Diagram;
class GetAllLayers{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "Drawing.vsd");

        # get Visio page
        $page=$diagram->getPages()->getPage(0);

        $layers=$page->getPageSheet()->getLayers();

        $i = 0;
        while ($i<$layers->getCount()) {
            $layer=$layers->get($i);
            print "Name: " . (string)$layer->getName()->getValue();
            print "Visibility: " . (string)$layer->getVisible()->getValue();
            print "Status: " . (string)$layer->getStatus()->getValue();
            $i += 1;
        }
    }
}