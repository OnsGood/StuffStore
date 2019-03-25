<#import "parts/common.ftl" as e>

<@e.page>
<div align="center">
    <h2>STUFF LIST</h2><br>
</div>
<#list things as thing>
    <div>
        <form action="path" method="post">
            <b>${thing.name}</b>
            <span>${thing.count}</span>
            <input type="submit" value="Перейти" class="link" />
        </form>
    </div>
<#else>
No things available
</#list>

</@e.page>