#!/bin/sh

#    Openbravo POS is a point of sales application designed for touch screens.
#    Copyright (C) 2007-2009 Openbravo, S.L.
#    http://sourceforge.net/projects/openbravopos
#
#    This file is part of Openbravo POS.
#
#    Openbravo POS is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    Openbravo POS is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

DIRNAME=`dirname $0`

CP=$DIRNAME/openkpos_out.jar

CP=$CP:$DIRNAME

CP=$CP:$DIRNAME/jasperreports-3.1.4.jar
CP=$CP:$DIRNAME/jcommon-1.0.15.jar
CP=$CP:$DIRNAME/jfreechart-1.0.12.jar
CP=$CP:$DIRNAME/jdt-compiler-3.1.1.jar
CP=$CP:$DIRNAME/commons-beanutils-1.7.jar
CP=$CP:$DIRNAME/commons-digester-1.7.jar
CP=$CP:$DIRNAME/iText-2.1.0.jar
CP=$CP:$DIRNAME/poi-3.2-FINAL-20081019.jar
CP=$CP:$DIRNAME/barcode4j-light.jar
CP=$CP:$DIRNAME/commons-codec-1.3.jar
CP=$CP:$DIRNAME/velocity-1.5.jar
CP=$CP:$DIRNAME/oro-2.0.8.jar
CP=$CP:$DIRNAME/commons-collections-3.1.jar
CP=$CP:$DIRNAME/commons-lang-2.1.jar
CP=$CP:$DIRNAME/bsh-core-2.0b4.jar
CP=$CP:$DIRNAME/RXTXcomm.jar
CP=$CP:$DIRNAME/jpos1121.jar
CP=$CP:$DIRNAME/swingx-0.9.5.jar
CP=$CP:$DIRNAME/substance.jar
CP=$CP:$DIRNAME/substance-swingx.jar

# Apache Axis SOAP libraries.
CP=$CP:$DIRNAME/axis.jar
CP=$CP:$DIRNAME/jaxrpc.jar
CP=$CP:$DIRNAME/saaj.jar
CP=$CP:$DIRNAME/wsdl4j-1.5.1.jar
CP=$CP:$DIRNAME/commons-discovery-0.2.jar
CP=$CP:$DIRNAME/commons-logging-1.0.4.jar

# OpenK POS...
CP=$CP:$DIRNAME/aspectjrt.jar
CP=$CP:$DIRNAME/org.eclipse.emf_2.6.0.v20100914-1218.jar
CP=$CP:$DIRNAME/org.eclipse.emf.common_2.6.0.v20100914-1218.jar
CP=$CP:$DIRNAME/org.eclipse.emf.ecore_2.6.1.v20100914-1218.jar
CP=$CP:$DIRNAME/org.eclipse.emf.ecore.xmi_2.5.0.v20100521-1846.jar
CP=$CP:$DIRNAME/postgresql-jdbc3-8.2.jar
CP=$CP:$DIRNAME/bcprov-jdk16-146.jar

CP=$CP:$DIRNAME/locales/
CP=$CP:$DIRNAME/reports/

# Select the library folder
case "`uname -s`" in
Linux)
    case "`uname -m`" in
    i686) LIBRARYPATH=/lib/Linux/i686-unknown-linux-gnu;;
    ia64) LIBRARYPATH=/lib/Linux/ia64-unknown-linux-gnu;;
    x86_64|amd64) LIBRARYPATH=/lib/Linux/x86_64-unknown-linux-gnu;;
    esac;;
SunOS)
    case "`uname -m`" in
    sparc32) LIBRARYPATH=/Solaris/sparc-solaris/sparc32-sun-solaris2.8;;
    sparc64) LIBRARYPATH=/Solaris/sparc-solaris/sparc64-sun-solaris2.8;;
    esac;;
Darwin) LIBRARYPATH=/lib/Mac_OS_X;;
CYGWIN*|MINGW32*) LIBRARYPATH=/lib/Windows/i368-mingw32;;
esac

# start Openbravo POS
java -cp $CP -Djava.util.logging.config.file=$DIRNAME/logging.properties -Dswing.defaultlaf=javax.swing.plaf.metal.MetalLookAndFeel -Djava.library.path=$DIRNAME:$LIBRARYPATH -Ddirname.path=$DIRNAME/ pt.ktc.openk.pos.forms.StartOpenKPOS "$@"
