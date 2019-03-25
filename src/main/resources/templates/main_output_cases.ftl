<#import "parts/common.ftl" as e>

<@e.page>
<div align="center">
    <h2>STUFF LIST</h2><br>
</div>
<#list cases as case>
    <div>
        <form action="path" method="post">
            <b>${case.name}</b>
            <input type="submit" value="Перейти" class="link" />
        </form>
    </div>
<#else>
No cases available
</#list>

</@e.page>