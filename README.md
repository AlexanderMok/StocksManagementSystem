# stocksManagement
This is a system for stocks management.

Struts2, Spring, Mybatis, MySql(View,Trigger),Proxool are the main sources to use apart from html,css,javascript and ajax.

To better realise need to process items information, I created three **VIEW**S in MySql Database for item info and two **TRIGGER**S for journal account of in and out.

In the project, my skill to design a database has been trained. Mybatis is developer-friendly I think.

Nevertheness, the performance remains a question. I firstly did not use view. It took me quite some time to figure out how to transfer the java logic into mysql view creation. Thank god! I finally made it.

There is still much to learn.

**VIEW**S are much faster than normal query particularly when the data is in large scale. The following are some record. It is seen that the view query was 3 times faster than the normal query. 



INFO 2016-05-01 14:40:47,591 com.opensymphony.xwork2.util.logging.commons.CommonsLogger: Executed action [/supplyer!item!list!xhtml!200] took 1369 ms (execution: 1316 ms, result: 53 ms)

 INFO 2016-05-01 14:41:50,934 com.opensymphony.xwork2.util.logging.commons.CommonsLogger: Executed action [/item!list!xhtml!200] took 401 ms (execution: 292 ms, result: 109 ms)
