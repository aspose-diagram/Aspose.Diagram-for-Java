<?php
namespace Aspose\Diagram\WorkingwithMasters;

use com\aspose\diagram\Diagram as Diagram;
class GetMasterObject{

    public static function run($dataDir=null){
        # Getting a Master Object by ID
        GetMasterObject::get_master_object_by_id($dataDir);

        # Getting a Master Object by Name
        GetMasterObject::get_master_object_by_name($dataDir);
    }

    public static function get_master_object_by_id($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        $master_id = 2;
        # Get master object by id
        $master = $diagram->getMasters()->getMaster($master_id);

        print "Master ID : ".(string)$master->getID().PHP_EOL;
        print "Master Name : ".(string)$master->getName().PHP_EOL;
    }

    public static function get_master_object_by_name($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Set master name
        $master_name = "Background tranquil .2";
        # Get master object by name
        $master = $diagram->getMasters()->getMasterByName($master_name);

        print "Master ID : ".(string)$master->getID().PHP_EOL;
        print "Master Name : ".(string)$master->getName().PHP_EOL;
    }
}