<?php
namespace Aspose\Diagram\WorkingwithDiagrams;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class GetConnectorsInfo{

    public static function run($dataDir=null){

        # Crezate instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        $connectors = $diagram->getPages()->getPage(0)->getConnects();

        $i = 0;
        while ($i<sizeof($connectors->getCount())) {
        $connector =$connectors->get($i);
        # Display information about the Connectors
        print "From Shape ID : ".(string)$connector->getFromSheet().PHP_EOL;
        print "To Shape ID : ".(string)$connector->getToSheet().PHP_EOL;
        $i+=1;
        }
    }
}