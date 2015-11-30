<?php
namespace Aspose\Diagram\WorkingwithDiagrams;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class AddCommentToDiagram{

    public static function run($dataDir=null){
        # Create instance of Diagram
        $diagram = new Diagram($dataDir."Drawing.vsd");

        # Add comment
        $diagram->getPages()->getPage(0)->addComment(7.205905511811023, 3.880708661417323, "test@");

        # Save as VDX
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."AddComment.vdx", $saveFileFormat->VDX);
        print "Added comment successfully!".PHP_EOL;
    }

}