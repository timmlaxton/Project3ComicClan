import React, {Component} from 'react';
import ComicDetails from '../../components/comics/ComicDetails';
import ReviewForm from '../../components/reviews/ReviewForm';
import Request from '../../helpers/request.js'

class ComicDetailContainer extends Component {
  constructor(props){
      super(props)
      this.userReviewPost = this.userReviewPost.bind(this)
  }

  componentDidMount(){
    console.log(this.props);
  }

  userReviewPost(review){
    const request = new Request()
    console.log(review);

    request.post('/api/reviews', review).then(() => {
      const updatedComic = this.props.comic;
      if(updatedComic._embedded.reviews){
        updatedComic._embedded.reviews.push(review)
      }
      this.props.handleReviewAdded(updatedComic)
    })
  }

  render(){
    return(
      <div className="comic-detail-container">
        <ComicDetails comic={this.props.comic} user={this.props.user} userReviewPost={this.userReviewPost} handleUserSelect={this.handleUserSelect} />
      </div>
    )
  }

}

export default ComicDetailContainer;
