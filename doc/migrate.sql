#delete from archiver2.article;
insert into archiver2.article(boardid,threadid,articleid,author,posttime,`attachment`,`subject`)
  select boardid,threadid,articleid,author,posttime,`attachment`,`subject` from archiver.article where isvisible=1;

#delete from archiver2.articlebody;
insert into archiver2.articlebody(articleid,body) select a.articleid,body from
  archiver.article as a, archiver.articlebody as b where a.articleid=b.articleid and a.isvisible=1;

#delete from archiver2.deletedarticle;
insert into archiver2.deletedarticle(boardid,threadid,articleid,author,posttime,`attachment`,`subject`,body,deletetime,deleteby,deletereason)
  select a.boardid,threadid,a.articleid,author,posttime,`attachment`,`subject`,body,c.deletetime, c.deleteby, 'sync from .DELETED'
  from archiver.article as a, archiver.articlebody as b, archiver.deleted as c
  where a.articleid=b.articleid and a.originid=c.originid and a.boardid=c.boardid and a.isvisible=0;