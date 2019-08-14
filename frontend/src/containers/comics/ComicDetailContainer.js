import React, {Component} from 'react';
import ComicDetails from '../../components/comics/ComicDetails';
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

  componentDidMount(){
    console.log(this.props);
  }

  userReviewPost(review){
    const request = new Request()
    console.log(review);
    request.post('/api/reviews', review).then(() => {
      // this.setState({redirect: true})
      const updatedComic = this.props.comic;
      updatedComic._embedded.reviews.push(review)
      this.props.handleReviewAdded(updatedComic)
    })
  }

  render(){
    const {redirect} = this.state
    if (redirect){
      return(
        <div className="comic-detail-container">
          <ComicDetails comic={this.props.comic} user={this.props.user} userReviewPost={this.userReviewPost} handleUserSelect={this.handleUserSelect} />
        </div>
      )
    }else{
    return(
      <div className="comic-detail-container">
        <ComicDetails comic={this.props.comic} user={this.props.user} userReviewPost={this.userReviewPost} handleUserSelect={this.handleUserSelect} />
      </div>
    )
  }
  }


}

export default ComicDetailContainer;
