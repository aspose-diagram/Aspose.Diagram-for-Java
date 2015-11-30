<?php
namespace Aspose\Diagram\WorkingwithHeadersandFooters;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Color as Color;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class HeadersAndFooters{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."drawing.vsd");

        # add page number at the right corner of header
        $diagram->getHeaderFooter()->setHeaderRight("&p");

        # set text at the center
        $diagram->getHeaderFooter()->setHeaderCenter("Center of the header");

        # set text at the left side
        $diagram->getHeaderFooter()->setHeaderLeft("Left of the header");

        # add text at the right corner of footer
        $diagram->getHeaderFooter()->setFooterRight("Right of the footer");

        # set text at the center
        $diagram->getHeaderFooter()->setFooterCenter("Center of the footer");

        # set text at the left side
        $diagram->getHeaderFooter()->setFooterLeft("Left of the footer");

        # set header & footer color
        $color=new Color();
        $diagram->getHeaderFooter()->setHeaderFooterColor($color->getRed());

        # set text font properties
        $diagram->getHeaderFooter()->getHeaderFooterFont()->setItalic(1);
        $diagram->getHeaderFooter()->getHeaderFooterFont()->setUnderline(0);

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."HeadersAndFooters.vdx", $saveFileFormat->VDX);
        print "Done with headers and footers.".PHP_EOL;
    }
}