import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.greatonce.core.util.JsonUtil;

/**
 *
 * @author Lcc
 * @author Shenzhen Greatonce Co Ltd
 * @version 3.0
 * @version 2018/9/20
 */
public class JsonTest {

  public static void main(String[] args) {
    String response = "{\"cainiao_cloudprint_stdtemplates_get_response\":{\"result\":{\"datas\":{\"standard_template_result\":[{\"cp_code\":\"GTO\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1101,\"standard_template_name\":\"国通快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1101\\/106\",\"standard_waybill_type\":1},{\"standard_template_id\":75504,\"standard_template_name\":\"国通快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75504\\/28\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"5000000007756\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":82710,\"standard_template_name\":\"中国邮政国内标快标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/82710\\/21\",\"standard_waybill_type\":1},{\"standard_template_id\":84011,\"standard_template_name\":\"中国邮政国内标快标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/84011\\/24\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"DBKD\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1301,\"standard_template_name\":\"德邦快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1301\\/102\",\"standard_waybill_type\":1},{\"standard_template_id\":75304,\"standard_template_name\":\"德邦快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75304\\/33\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"QFKD\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1401,\"standard_template_name\":\"全峰快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1401\\/117\",\"standard_waybill_type\":1},{\"standard_template_id\":76802,\"standard_template_name\":\"全峰快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/76802\\/29\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"2460304407_385\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":190302,\"standard_template_name\":\"远成快运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/190302\\/6\",\"standard_waybill_type\":1},{\"standard_template_id\":190602,\"standard_template_name\":\"远成快运三联标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/190602\\/5\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"UC\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1001,\"standard_template_name\":\"优速快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1001\\/111\",\"standard_waybill_type\":1},{\"standard_template_id\":75105,\"standard_template_name\":\"优速快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75105\\/29\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"STO\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":201,\"standard_template_name\":\"申通快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/201\\/172\",\"standard_waybill_type\":1},{\"standard_template_id\":75402,\"standard_template_name\":\"申通快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75402\\/40\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"EYB\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1601,\"standard_template_name\":\"EMS经济快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1601\\/120\",\"standard_waybill_type\":1},{\"standard_template_id\":75404,\"standard_template_name\":\"EMS经济快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75404\\/26\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"SF\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1501,\"standard_template_name\":\"顺丰速运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1501\\/65\",\"standard_waybill_type\":1}]}},{\"cp_code\":\"ZTO\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":301,\"standard_template_name\":\"中通快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/301\\/192\",\"standard_waybill_type\":1},{\"standard_template_id\":74805,\"standard_template_name\":\"中通快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/74805\\/38\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"YTO\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":101,\"standard_template_name\":\"圆通快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/101\\/587\",\"standard_waybill_type\":1},{\"standard_template_id\":72417,\"standard_template_name\":\"圆通快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/72417\\/84\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"TTKDEX\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":601,\"standard_template_name\":\"天天快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/601\\/147\",\"standard_waybill_type\":1},{\"standard_template_id\":76403,\"standard_template_name\":\"天天快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/76403\\/54\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"CN7000001017817\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":238398,\"standard_template_name\":\"申通快运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/238398\\/1\",\"standard_waybill_type\":1},{\"standard_template_id\":238614,\"standard_template_name\":\"申通快运三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/238614\\/2\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"HTKY\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":501,\"standard_template_name\":\"百世快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/501\\/141\",\"standard_waybill_type\":1},{\"standard_template_id\":74606,\"standard_template_name\":\"百世快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/74606\\/41\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"100004928\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":34725,\"standard_template_name\":\"如风达标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/34725\\/44\",\"standard_waybill_type\":1},{\"standard_template_id\":75603,\"standard_template_name\":\"如风达标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75603\\/21\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"CN7000001009020\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":194434,\"standard_template_name\":\"德邦快运三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/194434\\/5\",\"standard_waybill_type\":2},{\"standard_template_id\":194938,\"standard_template_name\":\"德邦快运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/194938\\/6\",\"standard_waybill_type\":1},{\"standard_template_id\":250621,\"standard_template_name\":\"德邦快递（物流）\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/250621\\/1\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"YUNDA\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":401,\"standard_template_name\":\"韵达快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/401\\/167\",\"standard_waybill_type\":1},{\"standard_template_id\":76303,\"standard_template_name\":\"韵达快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/76303\\/47\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"ZJS\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":901,\"standard_template_name\":\"宅急送标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/901\\/118\",\"standard_waybill_type\":1},{\"standard_template_id\":75104,\"standard_template_name\":\"宅急送标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75104\\/26\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"3108002701_1011\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":191833,\"standard_template_name\":\"中通快运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/191833\\/8\",\"standard_waybill_type\":1},{\"standard_template_id\":192140,\"standard_template_name\":\"中通快运三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/192140\\/5\",\"standard_waybill_type\":2},{\"standard_template_id\":256771,\"standard_template_name\":\"中通快运标准面单\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/256771\\/4\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"BESTQJT\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":83910,\"standard_template_name\":\"百世快运标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/83910\\/75\",\"standard_waybill_type\":2},{\"standard_template_id\":84010,\"standard_template_name\":\"百世快运标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/84010\\/27\",\"standard_waybill_type\":1},{\"standard_template_id\":250934,\"standard_template_name\":\"百世快运（电商）\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/250934\\/3\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"CN7000001000869\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":251315,\"standard_template_name\":\"安能快运\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/251315\\/4\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"2744832184_543\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":251413,\"standard_template_name\":\"壹米滴答\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/251413\\/1\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"EMS\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":701,\"standard_template_name\":\"EMS标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/701\\/126\",\"standard_waybill_type\":1},{\"standard_template_id\":76503,\"standard_template_name\":\"EMS标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/76503\\/34\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"XFWL\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":249128,\"standard_template_name\":\"信丰物流标准二联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/249128\\/1\",\"standard_waybill_type\":1},{\"standard_template_id\":249422,\"standard_template_name\":\"信丰物流三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/249422\\/1\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"2383545689_32\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":188729,\"standard_template_name\":\"九曳标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/188729\\/6\",\"standard_waybill_type\":1},{\"standard_template_id\":188817,\"standard_template_name\":\"九曳标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/188817\\/5\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"POSTB\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":801,\"standard_template_name\":\"中国邮政快递包裹标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/801\\/131\",\"standard_waybill_type\":1},{\"standard_template_id\":75704,\"standard_template_name\":\"中国邮政快递包裹标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/75704\\/37\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"CN7000001021040\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":256622,\"standard_template_name\":\"韵达快运标准面单\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/256622\\/3\",\"standard_waybill_type\":4}]}},{\"cp_code\":\"SURE\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":133204,\"standard_template_name\":\"速尔快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/133204\\/11\",\"standard_waybill_type\":2},{\"standard_template_id\":133902,\"standard_template_name\":\"速尔快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/133902\\/35\",\"standard_waybill_type\":1}]}},{\"cp_code\":\"CN7000001003751\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":181603,\"standard_template_name\":\"跨越速运标准模版\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/181603\\/7\",\"standard_waybill_type\":1},{\"standard_template_id\":182004,\"standard_template_name\":\"跨越速运标准三联模版\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/182004\\/7\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"100007887\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":248932,\"standard_template_name\":\"递速物流标准二联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/248932\\/1\",\"standard_waybill_type\":1},{\"standard_template_id\":249423,\"standard_template_name\":\"递速物流三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/249423\\/1\",\"standard_waybill_type\":2}]}},{\"cp_code\":\"2608021499_235\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":183020,\"standard_template_name\":\"安能快递标准三联模版\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/183020\\/7\",\"standard_waybill_type\":2},{\"standard_template_id\":183119,\"standard_template_name\":\"安能快递标准模版\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/183119\\/7\",\"standard_waybill_type\":1}]}},{\"cp_code\":\"FAST\",\"standard_templates\":{\"standard_template_do\":[{\"standard_template_id\":1201,\"standard_template_name\":\"快捷快递标准模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/1201\\/105\",\"standard_waybill_type\":1},{\"standard_template_id\":74806,\"standard_template_name\":\"快捷快递标准三联模板\",\"standard_template_url\":\"http:\\/\\/cloudprint.cainiao.com\\/template\\/standard\\/74806\\/29\",\"standard_waybill_type\":2}]}}]},\"error_code\":\"0\",\"success\":true},\"request_id\":\"z61b25sfql6f\"}}";
    JSONArray jsonArray = JsonUtil.toJSONObject(response)
        .getJSONObject("cainiao_cloudprint_stdtemplates_get_response")
        .getJSONObject("result").getJSONObject("datas").getJSONArray("standard_template_result");
    for (Object o : jsonArray) {
      JSONObject jsonObject = (JSONObject) o;
      JSONArray array = jsonObject.getJSONObject("standard_templates")
          .getJSONArray("standard_template_do");
      System.out.println(
          "templateMap.put(\"" + jsonObject.getString("cp_code") + "\",\"" + array.getJSONObject(0)
              .getString("standard_template_url") + "\");");
    }
    System.out.println(jsonArray.size());
  }
}
