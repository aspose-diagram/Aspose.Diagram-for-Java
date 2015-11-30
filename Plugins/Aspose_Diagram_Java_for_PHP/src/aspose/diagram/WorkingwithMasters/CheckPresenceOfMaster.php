<?php
namespace Aspose\Diagram\WorkingwithMasters;

use com\aspose\diagram\Diagram as Diagram;
class CheckPresenceOfMaster{

    public static function run($dataDir=null){

        # Checking a Master Presence by ID
        CheckPresenceOfMaster::check_presence_master_by_id($dataDir);

        # Checking a Master Presence by Name
        CheckPresenceOfMaster::check_presence_master_by_name($dataDir);
    }

    public static function check_presence_master_by_id($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        $master_id = 2;
        # check master by id
        $is_present = $diagram->getMasters()->isExist($master_id);

        print "Master Presence : ".(string)$is_present.PHP_EOL;
    }

    public static function check_presence_master_by_name($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # Set master name
        $master_name = "Background tranquil .2";
        # check master object by name
        $is_present = $diagram->getMasters()->isExist($master_name);

        print "Master Presence : ".(string)$is_present.PHP_EOL;
    }

}