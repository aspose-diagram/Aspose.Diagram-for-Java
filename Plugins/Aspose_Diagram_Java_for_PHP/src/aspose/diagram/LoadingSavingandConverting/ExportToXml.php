<?php
namespace Aspose\Diagram\LoadingSavingandConverting;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class ExportToXml{

    public static function run($dataDir=null){

        # Exporting VSD to VDX
        ExportToXml::export_to_vdx($dataDir);

        # Exporting VSD to VSX
        ExportToXml::export_to_vsx($dataDir);

        # Exporting VSD to VTX
        ExportToXml::export_to_vtx($dataDir);
    }

    public static function export_to_vdx($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as VDX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.vdx", $saveFileFormat->VDX);

        print "Exported visio diagram to VDX.".PHP_EOL;
    }

    public static function export_to_vsx($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as VSX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.vsx", $saveFileFormat->VSX);

        print "Exported visio diagram to VSX.".PHP_EOL;
    }

    public static function export_to_vtx($dataDir=null){

        # Call the diagram constructor to load diagram from a VSD file
        $diagram = new Diagram($dataDir."drawing.vsd");

        # Save as VTX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."Diagram.vtx", $saveFileFormat->VTX);

        print "Exported visio diagram to VTX.".PHP_EOL;
    }
}