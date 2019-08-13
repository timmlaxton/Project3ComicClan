import React, {Component} from 'react';
import Comic from './Comic';
import ComicDetails from '../../components/comics/ComicDetails';
import Review from '../reviews/Review'
import ReviewForm from '../../components/reviews/ReviewForm';
import Request from '../../helpers/request.js'

class ComicDetailContainer extends Component {
  constructor(props){
      super(props)
      this.state= {
        redirect: false
      }
      this.userReviewPost = this.userReviewPost.bind(this)
  }

  userReviewPost(review, comic){
    const request = new Request()
    request.post('api/reviews', review).then(() => {
      this.setState({redirect: true})
    })
  }

  render(){
    const {redirect} = this.state
    if (redirect){
      const url = 'api/comics/' + 2
      return<Redirect to={url}/>
    }
    return(
      <div className="comic-detail-container">
        <ComicDetails comic={comic} user={this.state.currentUser} userReviewPost={this.userReviewPost} handleUserSelect={this.handleUserSelect} />
      </div>
    )
  }


}

export default ComicDetailContainer;
