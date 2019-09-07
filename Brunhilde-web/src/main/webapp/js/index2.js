/**
 * 查询所有
 * flag
 */
let currentPage = 0;//当前页
let pageSize = 6;//每一页的数量
function findAll() {
    console.log("yes")
    $.ajax({
        url: "selectAll?currentPage="+ currentPage +"&pageSize=" + pageSize,
        type: "get",
        success: function (response) {
            let total = response.total;
            var str = "";

            for (var i = 0; i < response.data.length; i++) {
                str += `<tr>
            <td>${response.data[i].gameName}</td>
            <td>${response.data[i].gameAddressName}</td>
            <td>${response.data[i].gameJobName}</td>
            <td>${response.data[i].gameRaceName}</td>
            <td>${response.data[i].gameRating}</td>
            <td>${response.data[i].gameCampName}</td>
            <td>
                <a href='#' class='btn btn-primary btn-xs' data-toggle='modal'
                   data-target='#customerEditDialog' onclick="findNPCById(${response.data[i].gameId})">修改</a>
                <a href='#' class='btn btn-danger btn-xs' data-toggle='modal'
                   data-target='#myModal'>删除</a>
            </td>
        </tr>`
            }

            $("tbody").html(str);

            if (currentPage == 0) {
                initPage(total);
            }

        }
    })
}

/**
 * 通过id查找信息
 //  */
function findNPCById(id) {

    console.log(id)
    $.ajax({
        url: `findNPCById/${id}`,
        type: "get",
        success: function (res) {

            $("#edit_NPCName").val(res.gameName)
            //将游戏ID传到我们隐藏域中，之后进行修改操作是可以用到的
            $("#edit_NPC_id").val(res.gameId)
            //
        }
    })


}


// /**
//  * 初始化分页插件
//  * 总页数
//  * 列表数据
//  */
//

function initPage(total) {
    $("#pagination").pagination(total,
        //分布总数量，必须参数
        {
            // callback: clickPageHandler,
            // PageCallback() 为翻页调用次函数。
            callback: clickPageHandler,
            prev_text: "❥(上一页) ",
            next_text: "下一页→ »",
            items_per_page: pageSize,
            num_edge_entries: 4,       //两侧首尾分页条目数
            num_display_entries: 2,    //连续分页主体部分分页条目数
            current_page: currentPage,   //当前页索引


        }
    );
}

findAll();
function clickPageHandler(page) {

    // 解决递归
    if (currentPage == 0){
        currentPage = page + 1;

    }else if (currentPage!=0) {
        currentPage = page + 1;
        findAll();
    }



//
}
//
//



// /**
//  * 引入页面 加载下拉框信息
//  */
//
function getSelectData(code) {



    $.ajax({

        url: `findByTypeCode/${code}`,
        type: "get",
        success: function (response) {
            console.log(response)

            var str = "";
            for (let i = 0; i < response.length; i++) {
                str += `<option value="${response[i].baseType}">${response[i].baseContent}</option>`
            }
            if (code === "001") {
                $("#NPCBirthplace").append(str)
                $("#edi_NPCBirthplace").append(str)
            }
            if (code === "002") {
                $("#NPCJob").append(str)
                $("#edit_NPCJob").append(str)
            }

            if (code === "003") {
                $("#NPCRace").append(str)
                $("#edit_NPCRace").append(str)

            }

            if (code === "004") {
                $("#NPCCamp").append(str)
                $("#edit_NPCCamp").append(str)

            }
        }
    })

}
//
getSelectData("001");
getSelectData("002");
getSelectData("003");
getSelectData("004");



var sendUpdate = document.querySelector("#sendUpdate");



sendUpdate.addEventListener("click",function () {
    var serialize = $("#edit_NPC_form").serialize();
    $.ajax({
        url:"update?" + serialize,
        type:"put",
        success:function (res) {
            console.log(serialize)
            console.log(res)
            findAll();
        }
    })


})
