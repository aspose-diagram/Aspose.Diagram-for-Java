<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
use com\aspose\diagram\ConFixedCodeValue as ConFixedCodeValue;
class SelectRerouteOption{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."Drawing.vsd");

        # Access a particular page
        $page=$diagram->getPages()->getPage("Flow 1");

        # get a particular connector shape
        $shape=$page->getShapes()->getShape(1);

        # set reroute option
        $conFixedCodeValue=new ConFixedCodeValue();
        $shape->getLayout()->getConFixedCode()->setValue($conFixedCodeValue->NEVER_REROUTE);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SelectRerouteOption.vdx", $saveFileFormat->VDX);
        print "Seleted reroute option of the connector shape.".PHP_EOL;
    }
}