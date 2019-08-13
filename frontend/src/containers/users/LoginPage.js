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
    request.post('api/users', newUser)
    //.then and get the response from our backend
    .then(res => res.json())
    //we should be able to pluck an id off that response
    //add the id to newUser
    //THEN this.onUserSelected(newUser)
    .then(dbUser => this.onUserSelected(dbUser))

  }

  render(){

    const {redirect} = this.state
    if(redirect){
      const url = '/users/' + this.props.user.id
      return(
        <div>
          <Redirect to={url} user={this.props.user}/>
          <UserPage user={this.props.user} users={this.props.users} comics={this.props.comics} onDelete={this.handleDelete}/>
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
