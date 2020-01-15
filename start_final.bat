@echo off

REM    Openbravo POS is a point of sales application designed for touch screens.
REM    Copyright (C) 2008-2009 Openbravo, S.L.
REM    http://sourceforge.net/projects/openbravopos
REM
REM    This file is part of Openbravo POS.
REM
REM    Openbravo POS is free software: you can redistribute it and/or modify
REM    it under the terms of the GNU General Public License as published by
REM    the Free Software Foundation, either version 3 of the License, or
REM    (at your option) any later version.
REM
REM    Openbravo POS is distributed in the hope that it will be useful,
REM    but WITHOUT ANY WARRANTY; without even the implied warranty of
REM    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
REM    GNU General Public License for more details.
REM
REM    You should have received a copy of the GNU General Public License
REM    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

set DIRNAME=%~dp0

set CP="%DIRNAME%openkpos.jar"

set CP=%CP%;"%DIRNAME%jasperreports-3.1.4.jar"
set CP=%CP%;"%DIRNAME%jcommon-1.0.15.jar"
set CP=%CP%;"%DIRNAME%jfreechart-1.0.12.jar"
set CP=%CP%;"%DIRNAME%jdt-compiler-3.1.1.jar"
set CP=%CP%;"%DIRNAME%commons-beanutils-1.7.jar"
set CP=%CP%;"%DIRNAME%commons-digester-1.7.jar"
set CP=%CP%;"%DIRNAME%iText-2.1.0.jar"
set CP=%CP%;"%DIRNAME%poi-3.2-FINAL-20081019.jar"
set CP=%CP%;"%DIRNAME%barcode4j-light.jar"
set CP=%CP%;"%DIRNAME%commons-codec-1.3.jar"
set CP=%CP%;"%DIRNAME%velocity-1.5.jar"
set CP=%CP%;"%DIRNAME%oro-2.0.8.jar"
set CP=%CP%;"%DIRNAME%commons-collections-3.1.jar"
set CP=%CP%;"%DIRNAME%commons-lang-2.1.jar"
set CP=%CP%;"%DIRNAME%bsh-core-2.0b4.jar"
set CP=%CP%;"%DIRNAME%RXTXcomm.jar"
set CP=%CP%;"%DIRNAME%jpos1121.jar"
set CP=%CP%;"%DIRNAME%swingx-0.9.5.jar"
set CP=%CP%;"%DIRNAME%substance.jar"
set CP=%CP%;"%DIRNAME%substance-swingx.jar"

rem Apache Axis SOAP libraries.
set CP=%CP%;"%DIRNAME%axis.jar"
set CP=%CP%;"%DIRNAME%jaxrpc.jar"
set CP=%CP%;"%DIRNAME%saaj.jar"
set CP=%CP%;"%DIRNAME%wsdl4j-1.5.1.jar"
set CP=%CP%;"%DIRNAME%commons-discovery-0.2.jar"
set CP=%CP%;"%DIRNAME%commons-logging-1.0.4.jar"

rem OpenK POS...
set CP=%CP%;"%DIRNAME%aspectjrt.jar"
set CP=%CP%;"%DIRNAME%org.eclipse.emf_2.6.0.v20100914-1218.jar"
set CP=%CP%;"%DIRNAME%org.eclipse.emf.common_2.6.0.v20100914-1218.jar"
set CP=%CP%;"%DIRNAME%org.eclipse.emf.ecore_2.6.1.v20100914-1218.jar"
set CP=%CP%;"%DIRNAME%org.eclipse.emf.ecore.xmi_2.5.0.v20100521-1846.jar"
set CP=%CP%;"%DIRNAME%postgresql-9.1-901.jdbc3.jar"
set CP=%CP%;"%DIRNAME%bcprov-jdk16-146.jar"
set CP=%CP%;"%DIRNAME%hsqldb.jar"

set CP=%CP%;"%DIRNAME%locales"
set CP=%CP%;"%DIRNAME%reports"

start /B javaw -cp %CP% -Djava.util.logging.config.file=%DIRNAME%logging.properties -Dswing.defaultlaf=javax.swing.plaf.metal.MetalLookAndFeel -Djava.library.path="%DIRNAME%Windows\i368-mingw32" -Ddirname.path="%DIRNAME%./" pt.ktc.openk.pos.forms.StartOpenKPOS ./openk_pos.properties ./openk_pos_services.properties
