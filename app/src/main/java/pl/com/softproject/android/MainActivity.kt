package pl.com.softproject.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.androidannotations.annotations.Background
import org.androidannotations.annotations.Click
import org.androidannotations.annotations.EActivity
import org.androidannotations.rest.spring.annotations.RestService
import pl.com.softproject.android.service.MyRestClient
import pl.com.softproject.android.service.MyRestClient_


@EActivity
class MainActivity : AppCompatActivity() {

    @RestService
    lateinit var myRestClient: MyRestClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @Click
    fun goButton() {
        println("!!!")
        makeRequest()
    }

    @Background
    fun makeRequest() {
        val svc = MyRestClient_(this)
        val res = svc.employees()

        println(res)
    }

}
