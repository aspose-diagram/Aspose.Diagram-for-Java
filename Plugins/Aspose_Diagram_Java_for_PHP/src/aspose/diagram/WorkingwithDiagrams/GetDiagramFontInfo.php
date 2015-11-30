<?php
namespace Aspose\Diagram\WorkingwithDiagrams;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class GetDiagramFontInfo{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir."drawing.vsd");

        $fonts = $diagram->getFonts();

        $i = 0;
        while ($i<sizeof($fonts->getCount())) {
        $font = $fonts->get($i);
        # Display information about the fonts
        print $font->getName();
        $i+=1;
        }
    }
}