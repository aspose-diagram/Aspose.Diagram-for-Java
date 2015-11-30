<?php
namespace Aspose\Diagram\WorkingwithMasters;

use com\aspose\diagram\Diagram as Diagram;
class GetMasterInfo{

    public static function run($dataDir=null)
    {

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir . "drawing.vsd");

        $masters = $diagram->getMasters();

        $i = 0;
        while ($i<sizeof($masters->getCount())){
            $master = $masters->get($i);
            print "Master ID : " . (string)$master->getID().PHP_EOL;
            print "Master Name : " . (string)$master->getName().PHP_EOL;
            $i += 1;
        }
    }
}