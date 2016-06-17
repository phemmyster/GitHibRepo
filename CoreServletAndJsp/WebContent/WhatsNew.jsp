<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- 
Example of including files at request time. 
   
Taken from Core Servlets and JavaServer Pages
from Prentice Hall and Sun Microsystems Press,
http://www.coreservlets.com/.
&copy; 2000 Marty Hall; may be freely used or adapted.
-->
<HTML>
<HEAD>
<TITLE>Latest News</TITLE>
<LINK REL=STYLESHEET
      HREF="JSP-Styles.css"
      TYPE="text/css">
</HEAD>

<BODY>

<CENTER>
<TABLE BORDER=5>
  <TR><TH CLASS="TITLE">
      What's New at NersdsterNews.com</TABLE>
</CENTER>
<P>

Here is a summary of our five most recent news stories:
<OL>
  <LI><jsp:include page="news/Item1.html" flush="true" />
  <LI><jsp:include page="news/Item2.html" flush="true" />
  <LI><jsp:include page="news/Item3.html" flush="true" />
  <LI><jsp:include page="news/Item4.html" flush="true" />
  <LI><jsp:include page="news/Item5.html" flush="true" />
</OL>
</BODY>
</HTML>