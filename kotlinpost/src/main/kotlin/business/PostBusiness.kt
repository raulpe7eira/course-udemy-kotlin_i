package business

import com.google.gson.Gson
import entity.FullParameters
import entity.PostEntity
import infra.EndpointConstants
import infra.OperationMethod
import repository.PostRepository

class PostBusiness {
    fun getAllPosts(): List<PostEntity> {
        val url = EndpointConstants.BASE.URL + EndpointConstants.POST.ALL_POSTS
        val fullParameters = FullParameters(url, OperationMethod.GET)
        val response = PostRepository.getAllPosts(fullParameters)
        return Gson().fromJson(response.jsonResponse, Array<PostEntity>::class.java).asList()
    }

    fun getSinglePost(id: Int): PostEntity {
        val url = EndpointConstants.BASE.URL + EndpointConstants.POST.SINGLE_POSTS
        val fullParameters = FullParameters(url, OperationMethod.GET, mapOf("id" to id.toString()))
        val response = PostRepository.getSinglePost(fullParameters)
        return Gson().fromJson(response.jsonResponse, Array<PostEntity>::class.java).first()
    }
}
