<#import "parts/common.ftl" as e>

<@e.page>
<div>
    <form action="/addthing" method="post">
        <div><label> Name : <input type="text" name="name"/> </label></div>
        <div><label> Count: <input type="text" name="count"/> </label></div>
        <div><input type="submit" value="Add"/></div>
    </form>
    <a href="/">Back to main page</a>
</div>
</@e.page>