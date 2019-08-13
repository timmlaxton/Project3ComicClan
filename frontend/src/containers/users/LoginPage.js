import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import LoginComponent from '../../components/users/LoginComponent.js';
import NewUserForm from '../../components/users/NewUserForm.js';
import Request from '../../helpers/request';
import {Redirect} from 'react-router';
import UserPage from '../../components/users/UserPage';

class LoginPage extends Component {
  constructor(props){
    super(props);
    this.state={
      redirect: false
    }
    this.onUserSelected =  this.onUserSelected.bind(this)
    this.handleNewUserPost = this.handleNewUserPost.bind(this)
  }

  onUserSelected(user){
    this.props.handleUserSelect(user)
    this.setState({redirect:true})
  }

  handleNewUserPost(newUser){
    const request = new Request();
    request.post('api/users', newUser).then(() => {
      //.then and get the response from our backend
      // const newRequest = new Request();
      // console.log(newRequest);
      //we should be able to pluck an id off that response
      //add the id to newUser
    })

    //THEN this.onUserSelected(newUser)
    this.onUserSelected(newUser)

  }

  render(){

    const {redirect} = this.state
    if(redirect){
      const url = '/users/' + this.props.user.id
      return(
        <div>
          <Redirect to={url} user={this.props.user}/>
          <UserPage user={this.props.user} />
        </div>
      )
    }

    return (

      <div>
        <LoginComponent onUserSelected={this.onUserSelected} users={this.props.users}/>
        <NewUserForm handleNewUserPost={this.handleNewUserPost}/>
      </div>
    )
  }
}

export default LoginPage;
